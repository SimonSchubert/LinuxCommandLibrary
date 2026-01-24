# TLDR

**Run tests**

```smalltalkci```

**Run with config**

```smalltalkci [.smalltalk.ston]```

**Specify Smalltalk**

```smalltalkci -s [Squeak64-5.3]```

**Headless mode**

```smalltalkci --headless```

**Debug mode**

```smalltalkci -d```

# SYNOPSIS

**smalltalkci** [_-s smalltalk_] [_-d_] [_options_] [_config_]

# PARAMETERS

**-s** _SMALLTALK_
> Smalltalk version.

**-d**
> Debug mode.

**--headless**
> No display.

**--image** _FILE_
> Use image file.

**--help**
> Show help.

# DESCRIPTION

**smalltalkci** tests Smalltalk projects. It runs CI for Smalltalk.

Multiple dialects supported. Squeak, Pharo, GemStone.

Configuration in STON. Project settings.

GitHub Actions ready. CI/CD integration.

Headless testing. No GUI required.

# CAVEATS

Smalltalk-specific. Configuration required. VM download may be slow.

# HISTORY

**smalltalkci** was created to provide continuous integration testing for Smalltalk projects across multiple dialects.

# SEE ALSO

[pharo](/man/pharo)(1), [squeak](/man/squeak)(1)
