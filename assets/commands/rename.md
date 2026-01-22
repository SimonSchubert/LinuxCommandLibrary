# TLDR

**rename** can refer to multiple commands with the same name

View documentation for the **Perl version**

```tldr -p common rename```

View documentation for the **util-linux version**

```tldr rename.util```

# SYNOPSIS

**rename** [_options_] _expression_ _replacement_ _files_...

# DESCRIPTION

**rename** is a command for batch renaming files. Two major implementations exist:

The **Perl rename** (also called prename or rename.ul) uses Perl regular expressions for powerful pattern matching. It is common on Debian-based systems.

The **util-linux rename** uses simple string substitution. It replaces the first occurrence of a string in each filename. Common on Red Hat-based systems.

Check which version is installed with **rename --version** or **file $(which rename)**.

# SEE ALSO

[mv](/man/mv)(1), [mmv](/man/mmv)(1)
