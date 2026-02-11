# TAGLINE

Detect code smells in Ruby source files

# TLDR

**Check Ruby code for smells**

```reek [file.rb]```

**Check entire project**

```reek```

**Check with specific format**

```reek --format [yaml] [file.rb]```

**Show available smell types**

```reek --smell-types```

**Exclude specific smells**

```reek --except [TooManyStatements] [file.rb]```

# SYNOPSIS

**reek** [_options_] [_files_...]

# PARAMETERS

**-f**, **--format** _format_
> Output format (text, yaml, json, html).

**--smell-types**
> List available smells.

**--except** _smells_
> Exclude smells.

**--only** _smells_
> Check only specified smells.

**-c**, **--config** _file_
> Configuration file.

# DESCRIPTION

**Reek** is a static analysis tool that detects code smells in Ruby source files, reporting potential design problems such as long methods, feature envy, data clumps, and excessive parameter lists. It examines code structure and naming patterns to identify areas that may benefit from refactoring, based on principles from Martin Fowler's refactoring catalog.

Output can be formatted as text, YAML, JSON, or HTML for integration with CI pipelines and code review workflows. Individual smell types can be included or excluded with **--only** and **--except**, and project-wide configuration in **.reek.yml** allows tuning thresholds and excluding paths.

# EXAMPLES

```bash
# Check file
reek app/models/user.rb

# Check directory
reek app/

# JSON output
reek --format json app/ > smells.json

# List smell types
reek --smell-types

# Specific smells only
reek --only "TooManyStatements,LongMethod" app/

# With configuration
reek -c .reek.yml
```

# SMELL TYPES

```
TooManyStatements  - Method too long
FeatureEnvy        - Wrong class responsibility
DataClump          - Data always together
LongParameterList  - Too many parameters
DuplicateMethodCall - Repeated calls
```

# CONFIGURATION (.reek.yml)

```yaml
detectors:
  TooManyStatements:
    max_statements: 10
  exclude_paths:
    - spec/
```

# CAVEATS

Ruby-specific. Some smells may be false positives. Configure per project.

# HISTORY

Reek was created by **Kevin Rutherford** as a Ruby code smell detector based on Martin Fowler's refactoring concepts.

# SEE ALSO

[rubocop](/man/rubocop)(1), [ruby](/man/ruby)(1), [brakeman](/man/brakeman)(1)
