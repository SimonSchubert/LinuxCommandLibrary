# TAGLINE

bash builtin that declares variables with local scope within a function

# TLDR

**Declare a local variable**

```local [varname]```

**Declare a local variable with an initial value**

```local [varname]="[value]"```

**Declare a local integer variable**

```local -i [count]=0```

**Declare a local indexed array**

```local -a [array]=([a] [b] [c])```

**Declare a local readonly variable**

```local -r [constant]="[value]"```

**Inherit attributes and value from a variable in the surrounding scope**

```local -I [varname]```

# SYNOPSIS

**local** [_option_] _name_[=_value_] ...

# PARAMETERS

**-a**
> Declare as indexed array.

**-A**
> Declare as associative array.

**-i**
> Declare as integer.

**-l**
> Convert to lowercase.

**-u**
> Convert to uppercase.

**-r**
> Make readonly.

**-n**
> Name reference to another variable.

**-x**
> Mark for export to child processes.

**-I**
> Inherit attributes and value from a variable with the same name at a surrounding scope.

# DESCRIPTION

**local** is a bash builtin that declares variables with local scope within a function. Local variables are not visible outside the function where they are declared.

Using local prevents function variables from polluting or conflicting with the global namespace. The return status is zero unless local is used outside a function, an invalid name is supplied, or the variable is readonly.

# EXAMPLE

```bash
my_function() {
    local result="success"
    local -i count=5
    echo "$result: $count"
}
# $result and $count not accessible here
```

# CAVEATS

Only valid inside functions. Not POSIX-compliant (use typeset for portability). Local variables shadow global ones. Subshells inherit but cannot modify.

# SEE ALSO

[declare](/man/declare)(1), [typeset](/man/typeset)(1), [export](/man/export)(1), [readonly](/man/readonly)(1), [unset](/man/unset)(1), [bash](/man/bash)(1)
