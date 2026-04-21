# TAGLINE

Escape strings for systemd unit names

# TLDR

**Escape the given text**

```systemd-escape [text]```

**Reverse the escaping process**

```systemd-escape -u [escaped_text]```

**Treat the given text as a path (collapses slashes and "..")**

```systemd-escape -p [/path/to/resource]```

**Append a unit suffix to the escaped text**

```systemd-escape --suffix [service] [text]```

**Insert the escaped text into a template unit**

```systemd-escape --template [getty@.service] [tty1]```

**Build a .mount unit name from a path**

```systemd-escape -p --suffix=mount [/tmp/waldi/foobar/]```

**Mangle partially-unescaped input into a valid unit name**

```systemd-escape -m [some string]```

# SYNOPSIS

**systemd-escape** [_options_] [_string_...]

# PARAMETERS

**-u**, **--unescape**
> Reverse the escaping (decode). Cannot be combined with **--suffix=** or **--mangle**.

**-p**, **--path**
> Treat the argument as a file system path, simplifying slashes and ".." components. Useful for generating strings that match the `%f` specifier.

**--suffix=**_suffix_
> Append a unit type suffix such as `service` or `mount` to the escaped string. Incompatible with **--template=**, **--unescape**, and **--mangle**.

**--template=**_template_
> Insert the escaped string at the `@` position of a template unit name like `foobar@.service`. With **--unescape**, extracts and unescapes just the instance portion.

**-m**, **--mangle**
> Escape only obviously-unescaped characters and append a suitable unit suffix if missing. Incompatible with **--suffix=**, **--template=**, and **--unescape**.

**--instance**
> Used with **--unescape --template=**: print only the instance portion of a template unit name.

**-h**, **--help**
> Show help text.

**--version**
> Show version information.

# DESCRIPTION

**systemd-escape** converts arbitrary strings into valid systemd unit name components, or reverses that conversion. Systemd unit names have strict naming rules: only alphanumerics, `:`, `_`, and `.` are permitted; other characters are encoded as `\xNN` sequences, and `/` becomes `-`.

The tool is especially useful when constructing **.mount** or **.swap** units from paths, or when instantiating template units such as `foo@.service` with a dynamic instance string.

# EXAMPLES

```bash
$ systemd-escape 'Hallöchen, Meister'
Hall\xc3\xb6chen\x2c\x20Meister

$ systemd-escape -u 'Hall\xc3\xb6chen\x2c\x20Meister'
Hallöchen, Meister

$ systemd-escape -p --suffix=mount "/tmp//waldi/foobar/"
tmp-waldi-foobar.mount
```

# CAVEATS

Forward slashes in paths become dashes when escaped, and leading slashes are stripped by **--path**. Some option combinations are mutually exclusive (see above). Part of the systemd suite and available wherever systemd is installed.

# SEE ALSO

[systemctl](/man/systemctl)(1)
