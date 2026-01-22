# TLDR

**Format file and output to stdout**

```brittany [source.hs]```

**Format from stdin**

```cat [source.hs] | brittany```

**Format files in place**

```brittany --write-mode=inplace [*.hs]```

**Check formatting without modifying**

```brittany --check-mode [source.hs]```

**Use specific config file**

```brittany --config-file [brittany.yaml] [source.hs]```

**Set column limit**

```brittany --columns [100] [source.hs]```

# SYNOPSIS

**brittany** [_options_] [_files_]

# DESCRIPTION

**brittany** is a Haskell source code formatter that focuses on horizontal space utilization. It reformats code to make maximal use of available width while avoiding lines that are too long.

The formatter uses ghc-exactprint as the parser, supporting full GHC Haskell including extensions.

# PARAMETERS

**--write-mode** _mode_
> Output mode: stdout, inplace, or display

**--check-mode**
> Exit with error if formatting would change

**--columns** _n_
> Maximum line width (default: 80)

**--indent** _n_
> Indentation width (default: 2)

**--config-file** _file_
> Use specific configuration file

**--no-user-config**
> Ignore user configuration file

# CONFIGURATION

Default user config: **~/.config/brittany/config.yaml**

Project config: First **brittany.yaml** found in current or parent directories.

GHC extensions can be enabled in config:
```yaml
conf_forward:
  options_ghc:
    - -XLambdaCase
    - -XMultiWayIf
```

# CAVEATS

Some less common Haskell syntax elements are not fully supported. In-source comments may occasionally be moved or lost. This project is effectively unmaintained; consider using Ormolu or Fourmolu instead.

# SEE ALSO

[ormolu](/man/ormolu)(1), [fourmolu](/man/fourmolu)(1), [stylish-haskell](/man/stylish-haskell)(1), [ghc](/man/ghc)(1)
