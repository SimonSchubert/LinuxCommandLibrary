# TLDR

**Process ERB template**

```erb [template.erb]```

**Process with Ruby variables**

```erb -r [./vars.rb] [template.erb]```

**Output to file**

```erb [template.erb] > [output.html]```

**Trim mode for cleaner output**

```erb -T - [template.erb]```

**Print result without newline**

```erb -P [template.erb]```

# SYNOPSIS

**erb** [_options_] [_file_...]

# PARAMETERS

**-r** _library_
> Require Ruby library before processing.

**-T** _mode_
> Trim mode: 0, 1, 2, or -.

**-P**
> Don't print newline after output.

**-e**
> Ignore RUBYOPT environment variable.

**-x**
> Print Ruby script instead of executing.

**-n**
> Print line numbers in output.

**-v**
> Verbose mode.

**--version**
> Show version.

# DESCRIPTION

**erb** processes ERB (Embedded Ruby) templates, allowing Ruby code to be embedded within text files. ERB is commonly used in Rails views and configuration file generation.

Templates use special tags: `<%= expr %>` outputs the expression result, `<% code %>` executes code without output, and `<%# comment %>` is for comments.

# TEMPLATE SYNTAX

```erb
<h1><%= @title %></h1>
<ul>
<% @items.each do |item| %>
  <li><%= item %></li>
<% end %>
</ul>
<%# This is a comment %>
```

# TRIM MODES

```
-T 0  - No trimming
-T 1  - Trim lines ending with %>
-T 2  - Trim lines containing only <% %>
-T -  - Trim newlines after -%>
```

# CAVEATS

Embedded Ruby executes with full permissions. Input should be trusted. Complex logic belongs in code, not templates. Whitespace handling may need trim mode adjustment.

# HISTORY

ERB was created by **Masatoshi Seki** and included in Ruby's standard library. It became popular with Ruby on Rails as the default view template engine, though Rails now often uses alternatives like Slim or Haml.

# SEE ALSO

[ruby](/man/ruby)(1), [irb](/man/irb)(1), [haml](/man/haml)(1)
