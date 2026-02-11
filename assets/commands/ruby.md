# TAGLINE

Ruby programming language interpreter

# TLDR

**Start an interactive Ruby session** (IRB)

```ruby```

**Execute a Ruby script**

```ruby [script.rb]```

**Execute Ruby code from command line**

```ruby -e "[puts 'Hello, World!']"```

**Check syntax without executing**

```ruby -c [script.rb]```

**Run with warnings enabled**

```ruby -w [script.rb]```

**Execute and print result of expression**

```ruby -e "p [1, 2, 3].sum"```

**Process input line by line**

```ruby -n -e "puts $_.upcase" [file.txt]```

**In-place edit a file**

```ruby -i -pe "gsub(/old/, 'new')" [file.txt]```

# SYNOPSIS

**ruby** [_options_] [**-e** _command_] [_programfile_] [_arguments_]

# PARAMETERS

**-e** _command_
> Execute command as one line of script

**-c**
> Check syntax only, don't execute

**-w**
> Enable warnings

**-W** _level_
> Set warning level (0=silent, 1=medium, 2=verbose)

**-d**, **--debug**
> Enable debug mode

**-v**, **--verbose**
> Print version and enable verbose mode

**--version**
> Print version and exit

**-n**
> Wrap script in while gets() ... end loop

**-p**
> Like -n but print $_ after each iteration

**-a**
> Auto-split mode (with -n or -p), sets $F

**-i** [_ext_]
> In-place edit mode (backup with extension if given)

**-I** _dir_
> Add directory to load path

**-r** _library_
> Require library before executing

**-S**
> Search for script in PATH

**-x** [_dir_]
> Extract script from message and change to dir

# DESCRIPTION

**ruby** is the interpreter for the Ruby programming language. It executes Ruby scripts or runs interactive sessions, providing a dynamic, object-oriented environment for general-purpose programming.

Ruby emphasizes programmer happiness and productivity with elegant syntax. Everything is an object, and the language supports multiple programming paradigms: object-oriented, functional, and imperative.

The **-e** option allows quick one-liners without creating a file. Combined with **-n** or **-p**, Ruby becomes a powerful text processing tool similar to awk or perl.

For interactive exploration, use **irb** (Interactive Ruby) or **pry** for enhanced REPL features.

# CONFIGURATION

**RUBYLIB**
> Colon-separated list of directories prepended to the default load path ($LOAD_PATH).

**RUBYOPT**
> Default command-line options applied to every ruby invocation (e.g., -w for warnings).

**GEM_HOME**
> Directory where gems are installed, overriding the default gem path.

**GEM_PATH**
> Colon-separated list of directories to search for installed gems.

**BUNDLE_GEMFILE**
> Path to the Gemfile used by Bundler, overriding automatic detection.

# CAVEATS

Ruby versions can differ significantly. Use version managers like **rbenv** or **rvm** to manage multiple Ruby installations.

Gem dependencies should be managed with Bundler. Run scripts with **bundle exec** to ensure correct gem versions.

Ruby's global interpreter lock (GIL/GVL) limits true parallelism in threads. Use processes or specialized libraries for CPU-bound parallelism.

# HISTORY

Ruby was created by **Yukihiro "Matz" Matsumoto** in Japan, with the first public release in **1995**. Matz designed Ruby to be more powerful than Perl and more object-oriented than Python. Ruby gained worldwide popularity with the Ruby on Rails web framework released in **2004**.

# SEE ALSO

[irb](/man/irb)(1), [gem](/man/gem)(1), [bundle](/man/bundle)(1), [rake](/man/rake)(1), [rails](/man/rails)(1)
