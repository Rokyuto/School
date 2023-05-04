BEGIN{
  size=0;
}

{
  size+=$5;
}

END{
  print size/1024" kB";
}
