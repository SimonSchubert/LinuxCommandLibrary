# TAGLINE

Scientific calculator with math syntax and user-defined functions

# TLDR

**Start the interactive calculator**

```kalker```

**Evaluate an expression**

```kalker "sin(pi/4) + sqrt(2)"```

**Define a variable**

```kalker "x = 42"```

**Compute a derivative**

```kalker "f(x) = x^2; f'(3)"```

**Compute an integral**

```kalker "∫(0, pi, sin(x) dx)"```

# SYNOPSIS

**kalker** [_expression_]

# DESCRIPTION

**kalker** (also known as **kalk**) is a scientific calculator with math syntax that supports user-defined **variables** and **functions**, **complex numbers**, and estimation of **derivatives** and **integrals**. It provides a REPL interface with special-symbol completion (typing "sqrt" and pressing Tab converts to "√").

Features include Newton's method for root finding, automatic differentiation, numerical integration, and support for common mathematical constants and functions. It runs on Linux, macOS, Windows, Android, and in web browsers via WebAssembly.

# CAVEATS

Numerical integration and differentiation are approximations and may have precision limitations for some functions. Complex number support is automatic when results require it.

# HISTORY

**kalker** was created by **Oliver Waldemar** (PaddiM8) and is written in **Rust**. It was designed to provide a natural math syntax calculator that feels like writing expressions on paper rather than programming.

# SEE ALSO

[bc](/man/bc)(1), [dc](/man/dc)(1), [python3](/man/python3)(1)
