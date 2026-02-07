# TAGLINE

write values to dconf configuration database

# TLDR

**Write** a key value

```dconf write /[path/to/key] "[value]"```

Write a **string** value

```dconf write /[path/to/key] "'[string]'"```

Write an **integer** value

```dconf write /[path/to/key] "[5]"```

Write a **boolean** value

```dconf write /[path/to/key] "[true]"```

Write an **array** value

```dconf write /[path/to/key] "['first', 'second']"```

Write an **empty array**

```dconf write /[path/to/key] "@as []"```

# SYNOPSIS

**dconf write** _key_ _value_

# DESCRIPTION

**dconf write** sets a value in the dconf database. Values must be specified in GVariant text format, which requires careful quoting to satisfy both shell parsing and GVariant syntax requirements.

The challenge with dconf write is the layered quoting: the shell requires quotes around the entire value argument, while GVariant format requires its own quotes for strings. This leads to constructions like "'string value'" where outer double quotes are for the shell and inner single quotes are GVariant syntax. Integers, booleans, and other types don't need the inner quotes.

Changes take effect immediately for applications monitoring the dconf database. Unlike gsettings, dconf write doesn't validate values against schemas, so it's possible to write values that applications won't accept. For schema-validated writes with better error checking, use gsettings instead. dconf write is most useful in scripts where the value format is known and controlled.

# PARAMETERS

_key_
> Full path to the key

_value_
> Value in GVariant format

# VALUE FORMATS

**Strings**
> Single quotes inside double: "'text'"

**Integers**
> Plain numbers: "42"

**Booleans**
> true or false

**Arrays**
> ['item1', 'item2']

**Empty typed arrays**
> @as [] (string array), @ai [] (int array)

# CAVEATS

Quoting is tricky: shell quotes wrap GVariant format. Strings need both shell quotes and GVariant quotes. Invalid values are silently ignored. For validated writes, use gsettings.

# SEE ALSO

[dconf](/man/dconf)(1), [dconf-read](/man/dconf-read)(1), [gsettings](/man/gsettings)(1)
