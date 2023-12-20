Hello controller
<div>
    <form action="/login" method="post">
        <c:if test="${not empty error}">


            <div>
                <h5>${error}</h5>
            </div>
            <div><br></div>
        </c:if>
        <div>Username<input type="text"  name="userName" value=""></div>
        <div><br></div>
        <c:if test="${not empty error}">


        <div>
            <h5>${error}</h5>
        </div>
        <div><br></div>
    </c:if>
        <div>password<input type="text"  name="password" value=""></div>
        <div><input type="submit" value="LOgin"></div>
        <div><input type="button" value="Register" onclick="goToRegister()"></div>
    </form>
</div>
<script type="text/javascript">
    function goToRegister(){
        alert("going to register");
        window.location.href="/register";
    }

</script>