# TLDR

**Create XS module skeleton**

```h2xs -A -n [Module::Name]```

**Create module from C header**

```h2xs [header.h]```

**Create pure Perl module**

```h2xs -AX -n [Module::Name]```

**Omit autoload**

```h2xs -An [Module::Name]```

# SYNOPSIS

**h2xs** [_options_] [_headers_]

# PARAMETERS

_HEADERS_
> C header files to wrap.

**-n** _NAME_
> Module name.

**-A**
> Omit Autoloader code.

**-X**
> Omit XS code (pure Perl).

**-c**
> Omit constant code.

**-O**
> Overwrite existing files.

**-b** _VER_
> Perl version compatibility.

**--help**
> Display help information.

# DESCRIPTION

**h2xs** creates Perl extension module skeletons. It generates XS code to wrap C libraries, making them accessible from Perl.

The tool creates directory structure, Makefile.PL, and stub files. It can generate bindings from C header files or create empty module templates.

h2xs bootstraps Perl XS extensions.

# CAVEATS

Generated code needs customization. Complex C APIs require manual XS. Understanding C/XS helpful.

# HISTORY

h2xs has been part of **Perl** since version 5, providing the standard way to create XS extension modules.

# SEE ALSO

[xsubpp](/man/xsubpp)(1), [perlxs](/man/perlxs)(1), [h2ph](/man/h2ph)(1)
