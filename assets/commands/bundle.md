# TLDR

**Install** dependencies

```bundle install```

**Update** gems

```bundle update```

**Execute** in bundle context

```bundle exec [rake test]```

**Show** gem location

```bundle show [rails]```

**Create** new gem

```bundle gem [my_gem]```

# SYNOPSIS

**bundle** _command_ [_options_]

# DESCRIPTION

**bundle** (Bundler) is a dependency manager for Ruby. It ensures that the exact gem versions specified in a Gemfile are installed and loaded, preventing version conflicts and ensuring consistent environments.

The tool is essential for Ruby development and comes bundled with Ruby since version 2.6.

# PARAMETERS

**install**
> Install gems from Gemfile

**update** [_gems_]
> Update gems

**exec** _command_
> Execute command with bundle environment

**show** _gem_
> Show gem installation path

**list**
> List installed gems

**outdated**
> Show outdated gems

**clean**
> Remove unused gems

**lock**
> Create/update Gemfile.lock

**gem** _name_
> Create new gem scaffold

# GEMFILE

Gemfile specifies dependencies:
```ruby
source 'https://rubygems.org'

gem 'rails', '~> 7.0'
gem 'pg', '>= 1.0'
gem 'puma'

group :development do
  gem 'debug'
end
```

# WORKFLOW

```bash
# Install dependencies
bundle install

# Update specific gem
bundle update rails

# Run command with correct gem versions
bundle exec rails server
bundle exec rake test

# Check for outdated gems
bundle outdated

# Remove unused gems
bundle clean
```

# FEATURES

- Dependency resolution
- Version locking (Gemfile.lock)
- Isolated gem environments
- Gem groups (development, test, production)
- Local gem path override
- Git repository gems

# CAVEATS

Gemfile.lock should be committed for apps (not gems). bundle exec needed to use correct versions. Local gem modifications lost on bundle install. Conflicts possible with system gems. Large projects have slow resolution.

# HISTORY

**Bundler** was created by Carl Lerche, Yehuda Katz, and André Arko around **2009** to solve Ruby's dependency management problems, becoming the standard in **2010**.

# SEE ALSO

[gem](/man/gem)(1), [ruby](/man/ruby)(1), [rake](/man/rake)(1)
