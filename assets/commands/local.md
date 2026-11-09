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

**Restore shell options changed with set when the function returns**

```local -```

# SYNOPSIS

**local** [_option_] [_name_[=_value_] ... | **-**]

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

**-t**
> Give the variable the trace attribute.

**-I**
> Inherit attributes (except nameref) and value from a variable with the same name at a surrounding scope.

**-**
> Make the set of shell options local to the function.

# DESCRIPTION

**local** is a bash builtin that declares variables with local scope within a function. Their scope is restricted to that function and the functions it calls. With no operands, it lists the local variables.

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

Only valid inside functions. Not part of POSIX, although dash and other shells provide it, with fewer options. **typeset** is not POSIX either. Local variables shadow global ones. Subshells inherit but cannot modify.

# SEE ALSO

[declare](/man/declare)(1), [typeset](/man/typeset)(1), [export](/man/export)(1), [readonly](/man/readonly)(1), [unset](/man/unset)(1), [bash](/man/bash)(1)

# RESOURCES

```[Documentation](https://www.gnu.org/software/bash/manual/bash.html#index-local)```

<!-- verified: 2026-11-09 -->
