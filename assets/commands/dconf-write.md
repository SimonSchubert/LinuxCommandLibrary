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

**dconf write** sets a value in the dconf database. Values must be specified in GVariant text format, which requires careful quoting.

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
