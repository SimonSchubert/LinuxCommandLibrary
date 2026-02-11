# TAGLINE

Escape strings for systemd unit names

# TLDR

**Escape** the given text

```systemd-escape [text]```

**Reverse** the escaping process

```systemd-escape -u [text]```

**Treat** the given text as a path

```systemd-escape -p [text]```

**Append** a suffix to the escaped text

```systemd-escape --suffix [suffix] [text]```

**Use** a template and inject the escaped text

```systemd-escape --template [template] [text]```

# SYNOPSIS

**systemd-escape** [_options_] [_string_...]

# PARAMETERS

**-u, --unescape**
> Reverse the escaping (decode)

**-p, --path**
> Escape a file system path

**--suffix _suffix_**
> Append unit type suffix (.service, .mount, etc.)

**--template _template_**
> Insert escaped string into template at @ position

**-m, --mangle**
> Mangle string to be suitable as unit name

**--instance**
> Print only the instance part of a template

# DESCRIPTION

**systemd-escape** converts arbitrary strings into valid systemd unit name components. Systemd unit names have strict naming rules, and this tool handles the encoding of special characters.

This is particularly useful when creating mount units or template instances where paths or other strings must be encoded. The escaping follows systemd's unit name escaping rules.

# CAVEATS

Forward slashes in paths become dashes when escaped. The **--path** option handles leading slashes specially. Empty strings and certain special cases have defined escape sequences. Part of the systemd suite.

# SEE ALSO

[systemctl](/man/systemctl)(1), [systemd.unit](/man/systemd.unit)(5), [systemd.mount](/man/systemd.mount)(5)
