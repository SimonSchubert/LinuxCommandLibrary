# TLDR

**Declare an integer variable**

```typeset -i [count]=0```

**Declare a read-only variable**

```typeset -r [CONSTANT]="[value]"```

**Declare an uppercase variable**

```typeset -u [name]="[value]"```

**Declare a lowercase variable**

```typeset -l [name]="[VALUE]"```

**Export a variable** to child processes

```typeset -x [PATH]="[/usr/bin]"```

**Declare an array**

```typeset -a [myarray]=([one] [two] [three])```

**Declare an associative array** (bash 4+)

```typeset -A [mymap]=([key1]="[val1]" [key2]="[val2]")```

**List all variables** with specified attribute

```typeset -i```

# SYNOPSIS

**typeset** [**-aAfFgilnrtux**] [**-p**] [_name_[=_value_]...]

# PARAMETERS

**-a**
> Declare indexed array variable

**-A**
> Declare associative array variable (bash 4+)

**-f**
> Display function names and definitions

**-F**
> Display function names only

**-g**
> Create global variable when used in a function (bash only)

**-i**
> Treat variable as integer; arithmetic evaluation on assignment

**-l**
> Convert value to lowercase on assignment

**-n**
> Create nameref (reference to another variable)

**-r**
> Make variable read-only

**-t**
> Give variable the trace attribute

**-u**
> Convert value to uppercase on assignment

**-x**
> Export variable to environment of child processes

**-p**
> Display attributes and values of variables

# DESCRIPTION

**typeset** is a shell builtin that declares variables and assigns them attributes. In bash, it is a synonym for **declare** and is provided for compatibility with ksh (KornShell).

Variables can be given type attributes like integer (**-i**) for automatic arithmetic evaluation, or transformation attributes like uppercase (**-u**) and lowercase (**-l**). The read-only attribute (**-r**) prevents modification after assignment.

When used inside a function without **-g**, typeset creates a local variable that shadows any global variable of the same name. The variable is restored when the function exits.

Without arguments, typeset displays all variables with their attributes. With attribute flags alone (e.g., **typeset -i**), it lists variables having that attribute.

# CAVEATS

In bash, **typeset** is marked as obsolete in favor of **declare**, but both work identically. Behavior differs between shells (bash, ksh, zsh). The **-n** nameref option requires bash 4.3+ or ksh93. Associative arrays (**-A**) require bash 4+.

# HISTORY

**typeset** originated in the **KornShell** (ksh) developed by **David Korn** at Bell Labs in the early **1980s**. When bash was created, it implemented similar functionality as **declare** but included **typeset** as an alias for ksh compatibility. The command remains important for portable shell scripts targeting multiple Korn-like shells.

# SEE ALSO

[declare](/man/declare)(1), [local](/man/local)(1), [export](/man/export)(1), [readonly](/man/readonly)(1), [bash](/man/bash)(1)
