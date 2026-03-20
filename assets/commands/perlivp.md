# TAGLINE

verifies Perl installation

# TLDR

**Run installation verification**

```perlivp```

**Run with verbose output**

```perlivp -v```

**Print a description of each test before running it**

```perlivp -p```

**Run with both preface and verbose output**

```perlivp -p -v```

# SYNOPSIS

**perlivp** [_options_]

# PARAMETERS

**-p**
> Print a description of each test before performing it.

**-v**
> Give more detailed information about each test after it has been performed.

**-h**
> Print a brief help message.

# DESCRIPTION

**perlivp** (Perl Installation Verification Procedure) tests whether Perl and its libraries have been correctly installed. It is set up at Perl source code build time and should be run after `make install`.

A successful verification produces output like `ok 1`, `ok 2`, etc.

# CAVEATS

Part of Perl. Basic tests only. Run after installation.

# HISTORY

perlivp is part of **Perl core** for installation verification.

# SEE ALSO

[perl](/man/perl)(1), [perldiag](/man/perldiag)(1)

