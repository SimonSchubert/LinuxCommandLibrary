# TLDR

**Install browsers**

```npx playwright install```

**Run tests**

```npx playwright test```

**Run specific test**

```npx playwright test [test.spec.ts]```

**Run with UI mode**

```npx playwright test --ui```

**Generate code**

```npx playwright codegen [url]```

# SYNOPSIS

**playwright** _command_ [_options_]

# PARAMETERS

**install**
> Install browsers.

**test**
> Run tests.

**codegen**
> Record and generate code.

**show-report**
> Show test report.

**--ui**
> Interactive UI mode.

**--debug**
> Debug mode.

**--headed**
> Show browser window.

# DESCRIPTION

**Playwright** is a framework for browser automation and testing. It supports Chromium, Firefox, and WebKit with a unified API for cross-browser testing.

# EXAMPLES

```bash
# Setup new project
npm init playwright@latest

# Run all tests
npx playwright test

# Run with specific browser
npx playwright test --project=firefox

# Debug failing test
npx playwright test --debug

# Generate code by recording
npx playwright codegen example.com

# Show HTML report
npx playwright show-report
```

# TEST EXAMPLE

```typescript
import { test, expect } from '@playwright/test';

test('basic test', async ({ page }) => {
  await page.goto('https://example.com');
  await expect(page).toHaveTitle(/Example/);
});
```

# CAVEATS

Requires Node.js. Browser binaries are large. CI may need special setup.

# HISTORY

Playwright was developed by **Microsoft**, created by the team behind Puppeteer, released in 2020.

# SEE ALSO

[puppeteer](/man/puppeteer)(1), [cypress](/man/cypress)(1), [selenium](/man/selenium)(1)
