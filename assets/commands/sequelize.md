# TLDR

**Initialize sequelize**

```npx sequelize-cli init```

**Create model**

```npx sequelize-cli model:generate --name [User] --attributes [name:string,email:string]```

**Run migrations**

```npx sequelize-cli db:migrate```

**Undo last migration**

```npx sequelize-cli db:migrate:undo```

**Create seed**

```npx sequelize-cli seed:generate --name [demo-user]```

**Run seeds**

```npx sequelize-cli db:seed:all```

**Create migration**

```npx sequelize-cli migration:generate --name [add-column]```

# SYNOPSIS

**sequelize-cli** _command_ [_options_]

# PARAMETERS

**init**
> Initialize project.

**model:generate**
> Create model.

**db:migrate**
> Run migrations.

**db:migrate:undo**
> Revert migration.

**seed:generate**
> Create seed file.

**db:seed:all**
> Run all seeds.

**migration:generate**
> Create migration.

**--name** _NAME_
> Model/migration name.

**--attributes** _ATTRS_
> Model attributes.

# DESCRIPTION

**sequelize-cli** manages Sequelize ORM projects. It handles models, migrations, and seeds.

Initialization creates project structure. Config, models, migrations, and seeders directories.

Models define database tables. Attributes specify columns and types.

Migrations version database schema. Up and down functions for changes.

Seeds populate initial data. Development and testing data setup.

# CAVEATS

Node.js ORM. Database-specific syntax may vary. Migration ordering is important.

# HISTORY

**Sequelize** is a Node.js ORM supporting PostgreSQL, MySQL, SQLite, and others. The CLI provides scaffolding and migration tools.

# SEE ALSO

[node](/man/node)(1), [npm](/man/npm)(1), [knex](/man/knex)(1)
