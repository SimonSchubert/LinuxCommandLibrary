# TAGLINE

System error number lookup utility

# TLDR

**Look up error** by number

```errno [22]```

**Look up error** by name

```errno [EINVAL]```

**List all errors**

```errno -l```

**Search error** descriptions

```errno -s [permission]```

# SYNOPSIS

**errno** [_options_] [_error_...]

# PARAMETERS

_ERROR_
> Error number or name to look up.

**-l**, **--list**
> List all errors.

**-s**, **--search** _TEXT_
> Search descriptions.

**--help**
> Display help information.

# DESCRIPTION

**errno** looks up errno values and their descriptions. It translates between error numbers and symbolic names (like EINVAL, ENOENT) used in system calls.

The tool is valuable for debugging, helping understand system call failures. Error numbers from strace output or program errors can be quickly translated to meaningful descriptions.

errno also provides searching and listing capabilities to explore the full set of defined errors.

# CAVEATS

Error numbers may vary between architectures. Some errors are system-specific. Descriptions may be terse. Not all errno values have standard meanings.

# HISTORY

errno is part of the **moreutils** package. The errno system dates back to early Unix, providing a standardized way for system calls to report errors.

# SEE ALSO

[perror](/man/perror)(1), [strerror](/man/strerror)(3), [strace](/man/strace)(1)
