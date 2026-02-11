# TAGLINE

Generate Ruby documentation from source code

# TLDR

**Generate documentation**

```rdoc [file.rb]```

**Generate for directory**

```rdoc [lib/]```

**Generate with title**

```rdoc --title "[Project Name]" [lib/]```

**Output to directory**

```rdoc -o [doc/] [lib/]```

**Show help for class**

```ri [Array]```

# SYNOPSIS

**rdoc** [_options_] [_files_...]

# PARAMETERS

**-o**, **--output** _dir_
> Output directory.

**--title** _text_
> Documentation title.

**-f**, **--format** _format_
> Output format (html, ri).

**-m**, **--main** _file_
> Main page file.

**-x**, **--exclude** _pattern_
> Exclude files.

**-a**, **--all**
> Include all methods.

# DESCRIPTION

**RDoc** generates documentation from Ruby source files. It parses comments and code structure to create HTML documentation or ri data files.

# EXAMPLES

```bash
# Generate HTML docs
rdoc lib/

# With options
rdoc --title "My Gem" --main README.md lib/

# Generate ri data
rdoc -f ri lib/

# Exclude tests
rdoc -x test lib/

# View with ri
ri String#split
ri Array
```

# DOCUMENTATION FORMAT

```ruby
# Main description of class
#
# == Usage
#   obj = MyClass.new
#
# @param name [String] the name
# @return [Boolean] success status
class MyClass
  # Method description
  def my_method(name)
  end
end
```

# CAVEATS

Part of Ruby standard library. Alternative: YARD for enhanced features.

# HISTORY

RDoc was created by **Dave Thomas** for Ruby documentation, included in Ruby since version 1.8.

# SEE ALSO

[ri](/man/ri)(1), [yard](/man/yard)(1), [ruby](/man/ruby)(1)
