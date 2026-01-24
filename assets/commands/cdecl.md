# TLDR

**Start interactive mode**

```cdecl```

**Explain a C declaration**

```cdecl explain "[int *(*fp)(int)]"```

**Convert English to C declaration**

```cdecl declare "[x as pointer to function returning int]"```

**Cast an expression**

```cdecl cast "[x into pointer to function returning int]"```

**Explain a function declaration**

```cdecl explain "[void (*signal(int, void (*)(int)))(int)]"```

**Declare using English** in one command

```echo "declare x as array 10 of pointer to char" | cdecl```

**Set output to C++ mode**

```cdecl set options cplusplus```

# SYNOPSIS

**cdecl** [_-ciV_] [_command ..._]

# PARAMETERS

**-c**
> Use C++ syntax instead of C.

**-i**
> Enter interactive mode (default if no command given).

**-V**
> Display version information.

**explain** _declaration_
> Convert C/C++ declaration to English.

**declare** _description_
> Convert English description to C/C++ declaration.

**cast** _expression_
> Create a cast expression.

**set** _option_
> Set options (e.g., cplusplus, preansi).

**help**
> Display help in interactive mode.

**quit**
> Exit interactive mode.

# DESCRIPTION

**cdecl** (C declaration) translates complex C and C++ type declarations between their cryptic syntax and plain English. It helps programmers understand and construct complicated declarations involving pointers, arrays, and functions.

The tool can explain existing declarations like function pointers, arrays of pointers, or pointers to arrays in understandable terms. Conversely, it can generate correct C syntax from English descriptions, helping avoid common declaration mistakes.

In interactive mode, cdecl provides a prompt where you can enter multiple explain or declare commands. It handles complex scenarios like pointers to functions returning pointers to arrays, signal handler declarations, and other notoriously confusing C constructs.

The C++ mode adds support for references and member pointers. The tool is particularly valuable when working with legacy code, signal handlers, callback functions, or any code with deeply nested type declarations.

# CAVEATS

Some very complex or non-standard declarations may not be parsed correctly. The tool focuses on type declarations and does not handle full C/C++ syntax. Newer C++ features (concepts, auto, etc.) may not be supported. Different versions may have slightly different English phrasing.

# HISTORY

**cdecl** was originally written by Graham Ross and later enhanced by several contributors including David Wolverton. It emerged in the 1980s when C's declaration syntax was a frequent source of confusion and bugs. The phrase "declare x as..." became a teaching tool for understanding C's inside-out declaration reading. The tool remains useful today for complex declarations.

# SEE ALSO

[gcc](/man/gcc)(1), [clang](/man/clang)(1), [cscope](/man/cscope)(1), [ctags](/man/ctags)(1)
