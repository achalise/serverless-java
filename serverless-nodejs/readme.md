### Deploying to AWS Lambda

- `npm run watch` to watch for changes and automatically restart node with `nodemon`
- execute `zip -r function.zip .` from within the `dist` folder to build the distribution
- upload `function.zip` to aws lambda console
- specify `handler.handler` as `handler` in the aws lambda console
