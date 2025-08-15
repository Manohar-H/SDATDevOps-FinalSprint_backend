## SDATDevOps Final Sprint – Backend

### Overview
This repository contains the backend for the SDATDevOps Final Sprint project.  
It is a Spring Boot API that communicates with the frontend (in a separate repo) to provide application functionality.

---

### Prerequisites
- Docker and Docker Compose installed
- GitHub Personal Access Token (PAT) with `read:packages` permission (for pulling GHCR images)
- Python 3.10+ (if running locally without Docker)

---

### Getting Started (Local Development)

#### 1. Clone the repositories
```bash
git clone https://github.com/<your-username>/SDATDevOps-FinalSprint_backend.git
git clone https://github.com/<your-username>/SDATDevOps-FinalSprint_frontend.git
```

#### 2. Create `.env` file (if required)
```env
SECRET_KEY=your_django_secret_key
DEBUG=True
ALLOWED_HOSTS=*
DATABASE_URL=sqlite:///db.sqlite3
```

#### 3. Authenticate with GitHub Container Registry
```bash
export GHCR_TOKEN=your_pat_token_here
echo "$GHCR_TOKEN" | docker login ghcr.io -u <github-username> --password-stdin
```

#### 4. Run backend via Docker Compose
```bash
docker-compose up
```
#### This will start the backend API at [http://localhost:8080](http://localhost:8080).

---

### Running the Frontend and Backend Together
#### 1. In the backend terminal:
   ```bash
   docker-compose up
   ```
#### 2. In the frontend repo terminal:
   ```bash
   npm install
   npm start
   ```
#### 3. The frontend should connect to the backend API running locally.

---

### Verifying Communication
- Open the frontend in your browser (default: `http://localhost:3000`).
- Perform an action that requires backend data.
- Confirm API calls succeed in the browser dev tools network tab.

---

### Cloud Deployment Issues
When deploying to the cloud, I observed:
- **Authentication issues** pulling private GHCR images (required PAT setup).
- **CORS errors** when frontend and backend are hosted on different domains.
- **Port configuration mismatches** in some hosting providers.

---

### Development Workflow
- All changes were pushed via feature branches and merged via **Pull Requests**.
- PRs required code review before merge.
- CI/CD pipelines ran automated tests before deployment.

---

### Video Demo
A demo video has been recorded showing:
- Backend & frontend running locally
- Frontend interacting with backend endpoints

## Author:
###  --- Harini Manohar --- :)
### SD-12 | Semester-4 | Final Sprint for SDAT & DevOps
### Date: Aug 15, 2025
