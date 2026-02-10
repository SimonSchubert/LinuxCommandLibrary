# TAGLINE

classic static analysis tool for C programs

# TLDR

**Check C program**

```lint [program.c]```

**Check with library**

```lint -l[library] [program.c]```

**Suppress specific warnings**

```lint -e[code] [program.c]```

**Portable mode**

```lint -p [program.c]```

# SYNOPSIS

**lint** [_options_] _files_...

# PARAMETERS

**-a**
> Report assignments in conditionals.

**-b**
> Report break statements.

**-c**
> Produce .ln files.

**-e** _code_
> Suppress error code.

**-l** _lib_
> Include lint library.

**-p**
> Portable C checking.

**-v**
> Verbose output.

# DESCRIPTION

**lint** is a classic static analysis tool for C programs. It checks source code for potential bugs, stylistic errors, and suspicious constructs that are syntactically valid but likely incorrect.

lint performs deeper analysis than the compiler, catching type mismatches, unused variables, and problematic patterns.

# COMMON CHECKS

```
- Type consistency
- Unused variables
- Unreachable code
- Format string issues
- Missing return values
```

# CAVEATS

Original lint largely replaced by compiler warnings and modern tools like clang-tidy, cppcheck. Traditional lint may not be available on all systems.

# HISTORY

lint was written by **Stephen C. Johnson** at Bell Labs in **1978**. The name comes from the lint (fluff) it picks from programs. It pioneered static analysis tools.

# SEE ALSO

[splint](/man/splint)(1), [cppcheck](/man/cppcheck)(1), [clang-tidy](/man/clang-tidy)(1), [gcc](/man/gcc)(1)
