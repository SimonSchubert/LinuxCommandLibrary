# TLDR

**Filter translations through command**

```msgfilter [sed -e 's/old/new/g'] < [input.po] > [output.po]```

**Apply filter to messages**

```msgfilter -i [input.po] -o [output.po] [tr a-z A-Z]```

**Keep header**

```msgfilter --keep-header [command] < [input.po]```

**Process specific messages**

```msgfilter --msgid [command] < [input.po]```

# SYNOPSIS

**msgfilter** [_options_] _filter-command_

# PARAMETERS

_FILTER-COMMAND_
> Command to filter messages.

**-i** _FILE_
> Input PO file.

**-o** _FILE_
> Output PO file.

**--keep-header**
> Preserve PO header.

**--msgid**
> Filter msgid instead of msgstr.

**--help**
> Display help information.

# DESCRIPTION

**msgfilter** filters PO file translations through a command. It's part of GNU gettext.

The tool processes each msgstr through a filter. Useful for batch transformations.

msgfilter filters PO translations.

# CAVEATS

Part of gettext-tools. Filter applies to each message. May break formatting.

# HISTORY

msgfilter is part of **GNU gettext**, enabling automated translation transformations.

# SEE ALSO

[msgconv](/man/msgconv)(1), [msggrep](/man/msggrep)(1), [msguniq](/man/msguniq)(1)

