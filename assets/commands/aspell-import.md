# TAGLINE

Import old personal dictionaries into GNU Aspell

# TLDR

**Import** old personal dictionaries (Ispell and Aspell) automatically

```aspell-import```

**Invoke explicitly** through Perl if /usr/bin/perl is missing

```perl $(which aspell-import)```

# SYNOPSIS

**aspell-import**

# DESCRIPTION

**aspell-import** is a Perl script that searches for old personal dictionaries from **Ispell** and earlier versions of **Aspell**, then imports them into the current user's GNU Aspell personal word list. It is intended to be run once after installing Aspell or upgrading from Ispell.

The script scans the user's home directory and standard dictionary locations, converts each entry, and writes a header line so the result is a valid Aspell personal dictionary.

# PARAMETERS

This command takes no command-line options. Run it without arguments.

# CAVEATS

The script must be able to find a working Perl interpreter at `/usr/bin/perl`. If Perl is installed elsewhere, invoke the script with `perl /path/to/aspell-import`. Existing Aspell personal dictionaries may be overwritten, so back them up first. Ispell affix rules are not migrated, only word lists.

# HISTORY

**aspell-import** ships with **GNU Aspell** and was added so users could migrate accumulated personal word lists when moving from Ispell to Aspell.

# SEE ALSO

[aspell](/man/aspell)(1), [ispell](/man/ispell)(1)
