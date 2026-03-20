# TAGLINE

Continuous integration for Smalltalk projects

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
> Smalltalk image version to use (e.g., Squeak64-5.3, Pharo-10.0).

**-d**
> Debug mode for additional output when troubleshooting.

**--headless**
> Run the Smalltalk VM without graphical display (default for CI).

**--image** _FILE_
> Use a specific Smalltalk image file.

**--baseline** _NAME_
> Define the Metacello baseline to load or test.

**--dir** _PATH_
> Set the working directory for the project. Defaults to the current directory.

**--cache-dir** _PATH_
> Directory where Smalltalk images and VMs are cached.

**--github-token** _TOKEN_
> GitHub token for accessing private repositories or increasing API rate limits.

**--no-tracking**
> Opt out of anonymous build metrics collection.

**--help**
> Show help.

# DESCRIPTION

**smalltalkci** provides continuous integration testing for Smalltalk projects across multiple dialects including Squeak, Pharo, GemStone/S, and Moose. It automates the process of downloading the appropriate Smalltalk virtual machine, loading project code, running tests, and reporting results.

Configuration is defined in a **.smalltalk.ston** file using STON (Smalltalk Object Notation) format, specifying which Smalltalk platform to use, packages to load, and test classes to run. The tool integrates with GitHub Actions, Travis CI, and other CI/CD platforms.

Tests run in headless mode by default, requiring no graphical display. Debug mode provides additional output for troubleshooting failed builds, and a custom Smalltalk image can be specified for projects with specific environment requirements.

# CAVEATS

Smalltalk-specific. Configuration via .smalltalk.ston required. VM download may be slow on first run as images are cached.

# SEE ALSO

[pharo](/man/pharo)(1), [squeak](/man/squeak)(1)
