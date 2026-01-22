# TLDR

**Find** alternate file

```alt [path/to/file.rb]```

Find alternate in **specific directory**

```alt -d [app/] [test/models/user_test.rb]```

Find with **custom pattern**

```alt -e [.spec.ts] [src/component.ts]```

# SYNOPSIS

**alt** [_-d directory_] [_-e extension_] _file_

# DESCRIPTION

**alt** finds the "alternate file" for a given source file, typically switching between implementation and test files. It uses intelligent pattern matching to find related files based on common naming conventions.

For example, given **app/models/user.rb**, it would find **test/models/user_test.rb** or **spec/models/user_spec.rb**. This makes it easy to jump between code and tests in editor integrations.

# PARAMETERS

**-d** _directory_
> Limit search to specific directory

**-e** _extension_
> Specify alternate file extension

**-v**, **--version**
> Display version information

# CAVEATS

Pattern matching relies on common conventions; unusual project structures may not work. Results depend on files actually existing in expected locations.

# HISTORY

**alt** was created as a fast alternative to similar tools in vim and other editors, designed to work independently of any specific editor and integrate via shell commands.

# SEE ALSO

[find](/man/find)(1), [fd](/man/fd)(1), [fzf](/man/fzf)(1)
