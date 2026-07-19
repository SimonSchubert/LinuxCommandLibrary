# TAGLINE

Generate LICENSE files from the command line

# TLDR

**Generate MIT license**

```license-generator MIT```

**List supported licenses**

```license-generator -l```

**Set author and year**

```license-generator MIT --author [name] --year [2024]```

**Write to stdout**

```license-generator MIT --output /dev/stdout```

**Multiple licenses** (LICENSE-MIT and LICENSE-APACHE)

```license-generator MIT Apache```

# SYNOPSIS

**license-generator** [*options*] *LICENSE_TYPE*...

# DESCRIPTION

**license-generator** creates standard open-source **LICENSE** files from templates. Install with **cargo install license-generator**.

Supported types include AGPL, Apache, CC-BY, CC-BY-NC, CC-BY-NC-SA, CC-BY-SA, CC0, GPL, LGPL, MIT, MPL, and Unlicense (see **-l** for the full list of your version).

# PARAMETERS

*LICENSE_TYPE*

> One or more license keys (for example **MIT**, **Apache**). Multiple types produce **LICENSE-*** files.

**-l**, **--list**

> List available licenses.

**--author** *name*

> Author string (default: git user name and email when available).

**--project** *name*

> Project name (required by some licenses).

**--year** *year*

> Copyright year.

**--output** *path*

> Output path (default **./LICENSE**).

# CAVEATS

Generated text is a starting point; confirm the license matches your project's intent and any dual-licensing needs. Default author detection depends on git config.

# SEE ALSO

[cargo-license](/man/cargo-license)(1), [licensecheck](/man/licensecheck)(1)

# RESOURCES

```[Source code](https://github.com/azu/license-generator)```

<!-- verified: 2026-07-19 -->
