<?php
/*
 * Copyright (c) 2024.
 * Saman beheshtian
 * amintado@gmail.com
 * +989353466620
 * https://yiiman.ir
 */


$end_number=1000000000;
;
$start_time=microtime(true);

for ($i=1; $i<=$end_number; $i++){
    if ($i==$end_number){
        echo 'End after: '.(microtime(true)-$start_time);
    }
}