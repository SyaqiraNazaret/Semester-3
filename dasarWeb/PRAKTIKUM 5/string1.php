<?php

$loremIpsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. 
Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";

echo "<p>{$loremIpsum}</p>";
echo "Panjang Karakter: " . strlen($loremIpsum) . "<br>";
echo "Panjang Kata: " .str_word_count($loremIpsum) . "</p>";
echo "<p>" . strtoupper($loremIpsum) . "</p>";
echo "<p>" . strtolower($loremIpsum) . "</p>";
?>