# TLDR

**Declare local variable**

```local [varname]```

**Declare with initial value**

```local [varname]="[value]"```

**Declare integer variable**

```local -i [count]=0```

**Declare array**

```local -a [array]=([a] [b] [c])```

**Declare readonly local**

```local -r [constant]="[value]"```

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
> Name reference.

# DESCRIPTION

**local** is a bash builtin that declares variables with local scope within a function. Local variables are not visible outside the function where they are declared.

Using local prevents function variables from polluting or conflicting with the global namespace.

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

[declare](/man/declare)(1), [typeset](/man/typeset)(1), [export](/man/export)(1), [readonly](/man/readonly)(1)
