# TAGLINE

bash builtin for declaring variables with attributes

# TLDR

**Declare an integer variable**

```declare -i [number]=42```

**Declare a read-only variable**

```declare -r [CONSTANT]="value"```

**Declare an indexed array**

```declare -a [myarray]=([element1] [element2])```

**Declare an associative array**

```declare -A [mymap]=([key1]=value1 [key2]=value2)```

**Export a variable**

```declare -x [ENVVAR]="value"```

**Declare lowercase variable**

```declare -l [lower]="HELLO"```

**Declare uppercase variable**

```declare -u [upper]="hello"```

**List all functions**

```declare -f```

# SYNOPSIS

**declare** [_options_] [_name_[=_value_]...]

# PARAMETERS

**-a**
> Declare indexed array.

**-A**
> Declare associative array (bash 4+).

**-f**
> Display or declare functions.

**-F**
> Display function names only.

**-g**
> Create global variable (in functions).

**-i**
> Declare integer (arithmetic evaluation).

**-l**
> Convert to lowercase on assignment.

**-n**
> Name reference (bash 4.3+).

**-r**
> Make read-only (constant).

**-t**
> Give trace attribute (debugging).

**-u**
> Convert to uppercase on assignment.

**-x**
> Export to environment.

**-p**
> Display attributes and values.

**+**_attr_
> Remove attribute.

# DESCRIPTION

**declare** is a bash builtin that declares variables with specific attributes. While bash allows implicit variable creation, declare provides explicit type declarations and special behaviors.

Integer variables (**-i**) perform arithmetic automatically: `declare -i x; x=5+3` sets x to 8. Arrays require explicit declaration for proper initialization. Read-only variables cannot be changed or unset.

In functions, variables are local by default with declare; use **-g** for global scope. The **-n** option creates references to other variables, enabling indirect variable access.

# CAVEATS

Associative arrays and name references require bash 4+. Declare is bash-specific; POSIX shells use different mechanisms. The -g flag only works inside functions. Read-only variables persist until shell exit; they cannot be unset.

# HISTORY

The **declare** builtin originated in **ksh** (Korn Shell) and was adopted by bash. It provides a more explicit way to define variables than simple assignment. Bash has extended declare over versions, adding associative arrays in **bash 4.0** (2009) and name references in **bash 4.3** (2014).

# SEE ALSO

[typeset](/man/typeset)(1), [local](/man/local)(1), [readonly](/man/readonly)(1), [export](/man/export)(1)
