# TLDR

**Run specifications**

```phpspec run```

**Describe new class**

```phpspec describe [App\\ClassName]```

**Run specific spec**

```phpspec run [spec/ClassSpec.php]```

**Verbose output**

```phpspec run -v```

**Generate code**

```phpspec run --no-interaction```

# SYNOPSIS

**phpspec** [_command_] [_options_]

# PARAMETERS

**run** [_SPEC_]
> Run specifications.

**describe** _CLASS_
> Create new spec.

**-v**
> Verbose output.

**--no-interaction**
> Non-interactive mode.

**--help**
> Display help.

# DESCRIPTION

**phpspec** is PHP specification framework. Behavior-driven development tool.

The tool uses SpecBDD methodology. Design-first approach.

phpspec specifies behavior.

# CAVEATS

Different from PHPUnit. Focused on design. Object-oriented.

# HISTORY

PhpSpec was created for **behavior-driven PHP development** and design.

# SEE ALSO

[phpunit](/man/phpunit)(1), [behat](/man/behat)(1)

