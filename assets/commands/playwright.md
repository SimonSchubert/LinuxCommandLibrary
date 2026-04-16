# TAGLINE

Cross-browser automation and testing framework

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

**install** [_browser_]
> Install browsers (chromium, firefox, webkit) and dependencies.

**install-deps**
> Install OS-level dependencies required by browsers (Linux).

**test** [_files_]
> Run Playwright tests.

**codegen** [_url_]
> Record user actions and generate test code.

**show-report** [_dir_]
> Open the HTML report in a browser.

**open** [_url_]
> Open a page in Playwright inspector.

**--ui**
> Launch interactive UI mode for running and debugging tests.

**--debug**
> Run tests in debug mode with Playwright Inspector.

**--headed**
> Run browsers in headed mode (visible window).

**--project** _NAME_
> Run only the given project (browser) from the config.

**--workers** _N_
> Number of parallel test worker processes.

**--reporter** _NAME_
> Reporter to use (list, dot, line, html, json, junit).

**--grep** _PATTERN_
> Only run tests matching the regex pattern.

**--retries** _N_
> Number of times to retry failing tests.

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

# CONFIGURATION

**playwright.config.ts** or **playwright.config.js**
> Project configuration file defining browsers, test directories, timeouts, and reporter settings.

**PLAYWRIGHT_BROWSERS_PATH**
> Environment variable to override the browser binary download location.

# CAVEATS

Requires Node.js. Browser binaries are large. CI may need special setup.

# HISTORY

Playwright was developed by **Microsoft**, created by the team behind Puppeteer, released in 2020.

# SEE ALSO

[puppeteer](/man/puppeteer)(1), [node](/man/node)(1), [npx](/man/npx)(1)
