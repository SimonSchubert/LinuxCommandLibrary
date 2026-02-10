# TAGLINE

computer algebra system for symbolic mathematics

# TLDR

**Start Maxima**

```maxima```

**Evaluate expression**

```maxima --batch-string="[expand((x+1)^3)];"```

**Run script file**

```maxima -b [script.mac]```

**Use quiet mode**

```maxima -q```

**Start with wxMaxima interface**

```wxmaxima```

# SYNOPSIS

**maxima** [_options_]

# PARAMETERS

**-b**, **--batch** _file_
> Execute batch file.

**--batch-string** _expr_
> Evaluate expression.

**-q**, **--quiet**
> Suppress banner.

**-l** _lisp_
> Specify Lisp implementation.

**--init** _file_
> Initialization file.

**-p** _file_
> Preload Lisp file.

# DESCRIPTION

**Maxima** is a computer algebra system for symbolic mathematics. It can perform symbolic differentiation, integration, Taylor series, transforms, linear algebra, and more.

Maxima is descended from Macsyma, one of the oldest computer algebra systems.
# CAVEATS

Syntax differs from other CAS. Output formatting can be complex. GUI (wxMaxima) recommended for interactive use.

# HISTORY

Maxima descends from **Macsyma** developed at **MIT** starting in **1968**. The DOE version was released as open source in **1998** and became Maxima.

# SEE ALSO

[sage](/man/sage)(1), [octave](/man/octave)(1), [sympy](/man/sympy)(1), [wxmaxima](/man/wxmaxima)(1)
