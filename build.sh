#!/bin/sh

echo "Starting the build process..."
./gradlew build

echo "Build completed. Copying the generated JavaScript file to the React app's public directory..."
new_file=../Safehill-WebUI/public/kmp-shared.js
cp shared/build/dist/js/productionExecutable/shared.js $new_file

echo "File copied successfully to $new_file"
