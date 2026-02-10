# TAGLINE

displays help information for Koji commands

# TLDR

Display **all available commands**

```koji help```

Display help for **specific category**

```koji help [category]```

Display **help** for this command

```koji help --help```

# SYNOPSIS

**koji help** [_category_]

# DESCRIPTION

**koji help** displays help information for Koji commands. Without arguments, it lists all available commands. With a category argument, it shows commands in that category.

# PARAMETERS

**category**
> Filter commands by category: admin, all, bind, build, download, info, misc, monitor, search

**-h, --help**
> Display help information

# CAVEATS

Use `koji [subcommand] --help` for detailed help on specific commands rather than this general overview.

# SEE ALSO

[koji](/man/koji)(1)
