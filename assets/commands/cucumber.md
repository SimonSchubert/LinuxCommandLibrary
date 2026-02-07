# TAGLINE

behavior-driven development test runner

# TLDR

**Run all features**

```cucumber```

**Run specific feature file**

```cucumber [features/login.feature]```

**Run specific scenario by line**

```cucumber [features/login.feature]:[10]```

**Run with specific tag**

```cucumber --tags @[smoke]```

**Run excluding tag**

```cucumber --tags "not @[wip]"```

**Generate HTML report**

```cucumber --format html --out [report.html]```

**Dry run** (check syntax only)

```cucumber --dry-run```

# SYNOPSIS

**cucumber** [_options_] [_files_|_dirs_]

# DESCRIPTION

**cucumber** runs Behavior-Driven Development (BDD) tests written in Gherkin, a human-readable language for describing software behavior. It connects plain-language scenarios to executable step definitions.

Features describe behavior in Given/When/Then format that both developers and stakeholders can understand. Step definitions in Ruby (or other languages) implement the actual test logic.

# PARAMETERS

**-t**, **--tags** _expr_
> Run scenarios matching tag expression.

**-f**, **--format** _type_
> Output format (pretty, progress, html, json).

**-o**, **--out** _file_
> Write output to file.

**-r**, **--require** _path_
> Require files before execution.

**-d**, **--dry-run**
> Check syntax without running.

**-s**, **--strict**
> Fail on undefined or pending steps.

**--retry** _n_
> Retry failing scenarios n times.

**-p**, **--profile** _name_
> Use named profile from cucumber.yml.

**--order** _type_
> Run order (defined, random).

# CONFIGURATION

**cucumber.yml**
> Defines reusable profiles with pre-configured options for different test runs.

# CAVEATS

Step definitions must match scenario steps exactly. Shared state between steps can cause flaky tests. Gherkin syntax errors stop execution. Slow for large test suites.

# HISTORY

**Cucumber** was created by **Aslak Hellesoy** in **2008**, inspired by RSpec and JBehave. It popularized BDD by enabling executable specifications in plain language. Originally Ruby-based, implementations now exist for Java, JavaScript, and many other languages.

# SEE ALSO

[rspec](/man/rspec)(1), [behave](/man/behave)(1), [jest](/man/jest)(1), [pytest](/man/pytest)(1)
