<?php 
session_start();

#配置信息，一个都不能少
define("DB_HOST",'localhost');
define("DB_USER",'root');
define('DB_PWD','root');
define('DB_NAME','chat');
define('DB_PORT','3306');
define('DB_TYPE','mysql');

define('RY_KEY','m7ua80gbml32m');
define('RY_SECRET','nd8ZjYoDTH');
define('DB_CHARSET','utf8');

 

#格式化打印函数
function dump($data) {
    echo '<hr/><br/><pre>';
    print_r($data);
    echo '</pre><br/><hr/>';
}