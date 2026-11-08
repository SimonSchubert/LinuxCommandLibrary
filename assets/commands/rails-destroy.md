# TAGLINE

Remove files created by Rails generators

# TLDR

**Remove model**

```rails destroy model [Name]```

**Remove controller**

```rails destroy controller [Name]```

**Remove scaffold**

```rails destroy scaffold [Name]```

**Remove migration**

```rails destroy migration [Name]```

**Preview** what would be removed

```rails destroy scaffold [Name] --pretend```

**Use the short alias**

```rails d model [Name]```

# SYNOPSIS

**rails** **destroy** _generator_ _name_ [_options_]

# PARAMETERS

**model** _name_
> Remove model.

**controller** _name_
> Remove controller.

**scaffold** _name_
> Remove scaffold.

**migration** _name_
> Remove migration.

**-p**, **--pretend**
> Preview without removing.

**-f**, **--force**
> Overwrite files that already exist.

**-s**, **--skip**
> Skip files that already exist.

**-q**, **--quiet**
> Suppress status output.

# DESCRIPTION

**rails destroy** is the inverse of **rails generate**, removing all files and modifications that a generator previously created. It deletes model files, controllers, views, migrations, test files, and route entries that were scaffolded, cleanly undoing the generator's work without leaving orphaned code.

The **--pretend** flag previews which files would be removed without actually deleting anything, allowing verification before committing to the operation. The command accepts the same generator names and arguments as **rails generate**, making it straightforward to reverse any previous scaffolding operation.

# CAVEATS

Deleting a migration file does not undo a migration that has already run. Run **rails db:rollback** first.

# SEE ALSO

[rails](/man/rails)(1), [rails-generate](/man/rails-generate)(1)

# RESOURCES

```[Source code](https://github.com/rails/rails)```

```[Documentation](https://guides.rubyonrails.org/generators.html)```

<!-- verified: 2026-11-08 -->
