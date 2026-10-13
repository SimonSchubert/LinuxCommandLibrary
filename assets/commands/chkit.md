# TAGLINE

ClickHouse schema and migration CLI for TypeScript projects

# TLDR

**Scaffold** a starter TypeScript project

```npm create chkit@latest [my-app] -- --example hello```

Install the CLI in an **existing** project

```npm install --save-dev chkit @chkit/core```

**Generate** a named migration from schema files

```npx chkit generate --name [create-events]```

**Preview** pending SQL without applying it

```npx chkit migrate --json```

**Apply** reviewed migrations

```npx chkit migrate --apply```

Show **journal** status

```npx chkit status --json```

**CI gate**: pending migrations, checksums, live drift

```npx chkit check --strict --json```

# SYNOPSIS

**chkit** _command_ [_flags_]

# DESCRIPTION

**chkit** manages **ClickHouse** schemas as TypeScript (or Python) code: define tables, views, materialized views, and dictionaries, generate reviewable SQL migrations, apply them, and detect live drift from the terminal or CI.

The workflow is **define → generate → review → migrate → check**. Schema files are selected by `clickhouse.config.ts` (`defineConfig` from `@chkit/core`). Connected commands need **CLICKHOUSE_URL**, **CLICKHOUSE_USER**, **CLICKHOUSE_PASSWORD**, and **CLICKHOUSE_DB**. **generate** and **snapshot** can run offline when no URL is set.

`chkit generate` diffs definitions against `chkit/meta/snapshot.json` and writes SQL under `chkit/migrations/`. If nothing changed, no file is created. `chkit migrate --json` previews pending work; `--apply` (alias `--execute`) runs it. In a TTY, a plain `chkit migrate` prints the plan and asks; in CI it only reports the plan unless `--apply` is present. Destructive SQL (`DROP TABLE`, `DROP COLUMN`, and similar) needs confirmation, or **--allow-destructive** / `safety.allowDestructive` in non-interactive mode.

`chkit check --strict` exits nonzero for pending migrations, modified checksums, or live drift. Commit definitions, migration SQL, and `snapshot.json` together. Never edit SQL already recorded as applied.

The npm package **chkit** installs the `chkit` binary (`npx chkit` or `bunx chkit`). Node.js 22+ is documented for npm; Bun 1.3.5+ is the other TypeScript runtime. Python is a separate alpha package (`chkit-py`).

# PARAMETERS

**init**
> Scaffold a project with config and an example schema.

**generate**
> Diff schema files against the last snapshot and write migration SQL. **--name** sets the filename; **--dryrun** prints the plan without writing; **--empty** scaffolds a blank manual migration; **--table**, **--rename-table**, **--rename-column**, **--rename-dictionary** scope or rename.

**migrate**
> Apply pending SQL. **--json** previews; **--apply** / **--execute** applies; **--allow-destructive** permits danger operations in CI; **--retry** / **--abandon** recover a failed migration.

**status**
> Show total, applied, pending, and checksum mismatches.

**drift**
> Compare the snapshot to live ClickHouse.

**check**
> CI gate (pending, checksums, drift, plugins). **--strict** fails the process on those.

**snapshot**
> Rebuild `snapshot.json` from schema definitions (for example after a merge conflict). Always the whole snapshot; **--table** is rejected.

**query**
> Run ad-hoc SQL against the configured target.

**pull**
> Introspect live ClickHouse into a schema file (plugin).

**codegen**
> Generate typed row models (plugin).

**plugin**
> List or run plugin commands.

**--config** _path_
> Config file (default `clickhouse.config.ts` or `clickhouse.config.py`).

**--json**
> Machine-readable JSON on stdout.

**--table** _selector_
> Narrow some commands (`database.table`, `database.prefix*`, or `table`). Effect varies; **check** still scans all pending migrations and checksums.

**-h**, **--help**
> Built-in help without evaluating project config.

**--help-plugins**
> Include configured plugin flags.

**-v**, **--version**
> Print the CLI version.

# CONFIGURATION

**clickhouse.config.ts**
> `defineConfig` from `@chkit/core`: `schema` glob, `outDir` (default `./chkit`), and `clickhouse` connection (`url`, `username`, `password`, `database`).

**CLICKHOUSE_URL**, **CLICKHOUSE_USER**, **CLICKHOUSE_PASSWORD**, **CLICKHOUSE_DB**
> Target HTTP(S) endpoint, credentials, and database namespace. An intentionally blank password is allowed; an absent password is missing information.

**CHKIT_DEBUG**
> `1` or `true` for structured debug logs on stderr.

**CHKIT_JOURNAL_TABLE**
> Override the journal table name (default `_chkit_migrations`).

# CAVEATS

Project commands (**generate**, **migrate**, **status**, **drift**, **check**, **snapshot**, **codegen**, **pull**) need `clickhouse.config.ts` in the current directory. **migrate --json** does not apply SQL but a connected command may initialize the journal. Empty migration stubs are never recorded as applied. Changing SQL after it was applied fails checksum verification. Distro indexes may have no package; the published install is npm/Bun. Python is a different entry point (`chkit-py`), not this binary.

# HISTORY

**chkit** is developed by the **ObsessionDB** team as MIT-licensed schema tooling for self-hosted ClickHouse, ClickHouse Cloud, and ObsessionDB. The npm CLI package is **chkit** (0.2 series at the time of writing).

# SEE ALSO

[goose](/man/goose)(1), [diesel](/man/diesel)(1), [prisma](/man/prisma)(1), [sqlx](/man/sqlx)(1)

# RESOURCES

```[Source code](https://github.com/obsessiondb/chkit)```

```[Homepage](https://chkit.obsessiondb.com)```

```[Documentation](https://chkit.obsessiondb.com/cli/overview/)```

<!-- verified: 2026-10-13 -->
