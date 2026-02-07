# TAGLINE

Observe Java method arguments, return values, and exceptions live.

# TLDR

**Watch** method return value

```watch [com.example.MyClass] [myMethod] returnObj```

Watch **parameters and return**

```watch [com.example.MyClass] [myMethod] '{params, returnObj}'```

Watch with **condition**

```watch [com.example.MyClass] [myMethod] returnObj 'returnObj != null'```

Watch **exceptions**

```watch [com.example.MyClass] [myMethod] '{params, throwExp}' -e```

# SYNOPSIS

**watch** [_-n count_] [_-b_|_-e_|_-s_|_-f_] _class-pattern_ _method-pattern_ _express_ [_condition-express_]

# DESCRIPTION

**watch** is an Arthas command that observes method arguments, return values, and exceptions in real-time. It uses OGNL expressions to extract and display specific data from method invocations.

This enables debugging production issues without stopping the application or adding logging code.

# PARAMETERS

**class-pattern**
> Class name (supports wildcards)

**method-pattern**
> Method name (supports wildcards)

**express**
> OGNL expression for what to watch

**-b**
> Watch before method execution

**-e**
> Watch on exception

**-s**
> Watch on success return

**-f**
> Watch on finish (both success and exception)

**-n** _count_
> Stop after count invocations

**condition-express**
> Filter condition (OGNL)

# VARIABLES

- **params**: Method parameters array
- **returnObj**: Return value
- **throwExp**: Exception thrown
- **target**: Object instance

# CAVEATS

OGNL expressions can be complex; test carefully. Watching hot methods may impact performance.

# SEE ALSO

[arthas](/man/arthas)(1), [arthas-trace](/man/arthas-trace)(1)
