<?php

    $connection = mysqli_connect('127.0.0.1:3307', 'root', '', 'reg_db');

    if (!$connection) {
        die("Connection failed: " . mysqli_connect_error());
    }
    
    $del_id =  $_REQUEST['id'];

    $delete_query = "DELETE FROM reg_table where id=$del_id";
    
    $delete =  mysqli_query($connection, $delete_query);

    if ($delete) {
        header("location: view.php");
    }

mysqli_close($connection);
   