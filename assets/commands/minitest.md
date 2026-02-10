# TAGLINE

testing framework for Ruby that provides a complete suite of testing facilities

# TLDR

**Run all tests**

```ruby -Ilib:test [test/test_*.rb]```

**Run specific test file**

```ruby -Ilib:test [test/test_example.rb]```

**Run tests with verbose output**

```ruby -Ilib:test [test/test_example.rb] --verbose```

**Run specific test method**

```ruby -Ilib:test [test/test_example.rb] --name [test_method_name]```

**Run with pattern**

```ruby -Ilib:test [test/test_example.rb] --name /[pattern]/```

# SYNOPSIS

**ruby** -Ilib:test _test_file_ [_options_]

# PARAMETERS

**--verbose**
> Verbose output.

**--name** _pattern_
> Run matching tests.

**--seed** _n_
> Random seed.

**--pride**
> Rainbow output.

# DESCRIPTION

**Minitest** is a testing framework for Ruby that provides a complete suite of testing facilities. It includes unit tests, specs, mocking, and benchmarking.

Minitest is bundled with Ruby and is known for being fast and simple.

# TEST EXAMPLE

```ruby
require 'minitest/autorun'

class TestExample < Minitest::Test
  def setup
    @value = 1
  end

  def test_addition
    assert_equal 2, @value + 1
  end
end
```

# SPEC SYNTAX

```ruby
describe Example do
  it "works" do
    _(1 + 1).must_equal 2
  end
end
```

# CAVEATS

Bundled with Ruby since 1.9. Tests run in random order by default. Fewer features than RSpec but faster.

# HISTORY

Minitest was created by **Ryan Davis** (zenspider) as a minimal testing framework, included in Ruby's standard library since Ruby **1.9**.

# SEE ALSO

[rspec](/man/rspec)(1), [rake](/man/rake)(1), [ruby](/man/ruby)(1), [test-unit](/man/test-unit)(1)
