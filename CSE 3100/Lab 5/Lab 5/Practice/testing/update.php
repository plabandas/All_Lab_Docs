<?php

    $connection = mysqli_connect('127.0.0.1:3308', 'root', '', 'reg_db');

    if (!$connection) {
        die("Connection failed: " . mysqli_connect_error());
    }

    if (isset($_POST["submit"])) {

        $u_username = $_REQUEST['username']; 
        $u_email = $_POST['email'];
        $u_password = $_POST['password'];
        $u_id = $_POST['hidden_id'];

        $update_query = "UPDATE reg_table SET username='$u_username', email='$u_email', password='$u_password' WHERE id='$u_id'";
        $update = mysqli_query($connection, $update_query);
        if($update){
            header("location: view.php");
        }
    }



