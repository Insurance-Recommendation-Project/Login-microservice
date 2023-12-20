this is register page

<div>
    <form action="/set-user" method="post">

        <div>Username<input type="text"  name="userName" value=""></div>
        <div><br></div>

        <div>password<input type="text"  name="password" value=""></div>
        <div>addresse<input type="text"  name="addresse" value=""></div>
        <div>email<input type="text"  name="email" value=""></div>
        <div>numero<input type="text"  name="numero" value=""></div>

        <div><input type="submit" value="Register"></div>

    </form>
</div>
<script type="text/javascript">
    function goToRegister(){

        window.location.href="/register";
    }

</script>