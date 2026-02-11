# TAGLINE

Ruby behavior-driven development testing framework

# TLDR

**Run all specs**

```rspec```

**Run specific file**

```rspec [spec/models/user_spec.rb]```

**Run specific line**

```rspec [spec/models/user_spec.rb:25]```

**Run with tag**

```rspec --tag [focus]```

**Exclude tag**

```rspec --tag ~[slow]```

**Format output**

```rspec --format documentation```

**Run failed specs**

```rspec --only-failures```

**Random order**

```rspec --order random```

# SYNOPSIS

**rspec** [_--format fmt_] [_--tag tag_] [_options_] [_files_]

# PARAMETERS

**--format** _FORMAT_
> Output format.

**--tag** _TAG_
> Run tagged examples.

**--only-failures**
> Run previously failed.

**--order** _ORDER_
> Execution order.

**--fail-fast**
> Stop on first failure.

**--profile** _N_
> Show slowest examples.

**--dry-run**
> Show without running.

**-e**, **--example** _PATTERN_
> Match example name.

# DESCRIPTION

**rspec** is Ruby's behavior-driven testing framework. It provides readable test syntax.

Spec files describe expected behavior. Examples verify code meets expectations.

Matchers provide expressive assertions. Should, expect, and various comparison methods.

Tags organize and filter tests. Focus on specific categories or skip slow tests.

Failure tracking enables running only failed tests. Speeds up debugging cycles.

Formatters output results in various styles. Documentation format shows nested describe blocks.

# CAVEATS

Requires rspec gem. Rails apps use rspec-rails. Large suites may be slow.

# HISTORY

**RSpec** was created by **Steven Baker** and **David Chelimsky** around **2005**. It pioneered BDD-style testing in Ruby and influenced testing frameworks in other languages.

# SEE ALSO

[ruby](/man/ruby)(1), [rake](/man/rake)(1), [minitest](/man/minitest)(1), [cucumber](/man/cucumber)(1)
