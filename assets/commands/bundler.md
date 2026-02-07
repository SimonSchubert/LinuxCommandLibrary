# TAGLINE

Ruby dependency manager

# TLDR

**Install dependencies from Gemfile**

```bundle install```

**Add a gem to Gemfile**

```bundle add [gem]```

**Update all gems**

```bundle update```

**Update specific gem**

```bundle update [gem]```

**Execute command with bundled gems**

```bundle exec [command]```

**Initialize new Gemfile**

```bundle init```

**Show installed gems**

```bundle list```

**Check for security vulnerabilities**

```bundle audit```

# SYNOPSIS

**bundle** _command_ [_options_] [_arguments_]

# DESCRIPTION

**bundler** manages Ruby application dependencies by tracking and installing exact gem versions needed. It ensures consistent environments across development, staging, and production by using a Gemfile and Gemfile.lock.

Since Ruby 2.6, Bundler is part of Ruby's standard library.

# COMMANDS

**install**
> Install gems specified in Gemfile

**update**
> Update gems to latest versions within constraints

**exec**
> Execute command in context of bundle

**add**
> Add gem to Gemfile and install

**remove**
> Remove gem from Gemfile

**init**
> Generate a simple Gemfile

**list**
> Show all installed gems

**show**
> Show gem installation location

**check**
> Verify all dependencies are installed

**clean**
> Remove unused gems

**doctor**
> Display warnings about common problems

**gem**
> Create a simple gem skeleton

**platform**
> Display platform compatibility information

# PARAMETERS

**--no-color**
> Disable colored output

**--verbose**
> Enable verbose output

**--path** _directory_
> Install gems to specified directory

**--without** _groups_
> Exclude gem groups from installation

**--deployment**
> Install in deployment mode

# CONFIGURATION

**Gemfile**
> Specifies Ruby gem dependencies for the project. Located in the project root directory.

**.bundle/config**
> Per-project Bundler configuration including install paths, without groups, and deployment settings. Also reads from ~/.bundle/config for global defaults.

# CAVEATS

Always use **bundle exec** when running gem executables to ensure correct versions. The Gemfile.lock should be committed to version control. Running bundle update without arguments may introduce breaking changes.

# SEE ALSO

[gem](/man/gem)(1), [ruby](/man/ruby)(1), [rake](/man/rake)(1)
