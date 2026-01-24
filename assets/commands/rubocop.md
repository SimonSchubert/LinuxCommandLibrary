# TLDR

**Check current directory**

```rubocop```

**Check specific files**

```rubocop [file.rb] [other.rb]```

**Auto-correct safe issues**

```rubocop -a```

**Auto-correct all issues**

```rubocop -A```

**Check specific cops**

```rubocop --only [Layout/LineLength,Style/StringLiterals]```

**Generate config file**

```rubocop --init```

**Generate todo list**

```rubocop --auto-gen-config```

**Show offense details**

```rubocop --extra-details```

# SYNOPSIS

**rubocop** [_-a_] [_-A_] [_--only cops_] [_-c config_] [_options_] [_files_]

# PARAMETERS

**-a**, **--auto-correct**
> Auto-correct safe issues.

**-A**, **--auto-correct-all**
> Auto-correct all issues.

**--only** _COPS_
> Run specific cops only.

**--except** _COPS_
> Exclude specific cops.

**-c** _FILE_
> Configuration file.

**--auto-gen-config**
> Generate todo config.

**--init**
> Create .rubocop.yml.

**-f** _FORMAT_
> Output format.

**--display-cop-names**
> Show cop names.

**--extra-details**
> Show extra details.

**-L**, **--list-target-files**
> List files to check.

**--parallel**
> Run in parallel.

**--safe-auto-correct**
> Only safe corrections.

# DESCRIPTION

**rubocop** is a Ruby static code analyzer and formatter. It enforces style guidelines from the Ruby Style Guide.

Cops are individual rules checking specific style violations. Categories include Layout, Style, Lint, Metrics, and Naming.

Auto-correct modifies files to fix violations. Safe mode (-a) applies only corrections that don't change behavior. Full mode (-A) includes all corrections.

Configuration in .rubocop.yml customizes rules. Cops can be enabled, disabled, or configured with different parameters.

The auto-gen-config command creates a todo file ignoring current violations. This enables gradual adoption in existing projects.

Integration with editors shows issues in real-time. CI integration enforces style on pull requests.

# CAVEATS

Style is subjective - many teams customize heavily. Auto-correct can make mistakes. Large codebases take time to check.

# HISTORY

**RuboCop** was created by **Bozhidar Batsov** around **2012**. It became the standard Ruby linter, closely following the community Ruby Style Guide that Batsov also authored.

# SEE ALSO

[ruby](/man/ruby)(1), [bundle](/man/bundle)(1), [standardrb](/man/standardrb)(1), [reek](/man/reek)(1)
