@main def m(args: String*) =
    var i = 0
    while i < args.length do
        if i !=0 then
            print(" ")
        print(args(i))// print imprime todo en una sola linea
        i += 1 // puede ser  i = i +1
    println()// inserta por linea
    // de igual forma debe ejecutarse de esta forma scala programa argumentos