# TLDR

**Start development server**

```react-scripts start```

**Build for production**

```react-scripts build```

**Run tests**

```react-scripts test```

**Eject configuration**

```react-scripts eject```

# SYNOPSIS

**react-scripts** _command_ [_options_]

# COMMANDS

**start**
> Start development server.

**build**
> Create production build.

**test**
> Run test suite.

**eject**
> Expose configuration files.

# DESCRIPTION

**react-scripts** is the build tool for Create React App. It encapsulates webpack, Babel, ESLint, and other tools with zero configuration, handling development server, building, and testing.

# EXAMPLES

```bash
# Start dev server (port 3000)
npm start
# or
react-scripts start

# Production build
npm run build
# Creates build/ directory

# Run tests
npm test

# Run tests with coverage
npm test -- --coverage

# Eject (one-way operation)
npm run eject
```

# ENVIRONMENT VARIABLES

```bash
PORT=3001 npm start              # Custom port
BROWSER=none npm start           # Don't open browser
GENERATE_SOURCEMAP=false npm build  # No sourcemaps
CI=true npm test                 # CI mode
```

# PROXY SETUP

```json
// package.json
{
  "proxy": "http://localhost:5000"
}
```

# CAVEATS

Eject is irreversible. Limited customization without ejecting. Consider CRACO for config overrides.

# HISTORY

react-scripts was created by **Facebook** as part of Create React App (2016) to simplify React development setup.

# SEE ALSO

[create-react-app](/man/create-react-app)(1), [npm](/man/npm)(1), [vite](/man/vite)(1)
